package com.backend.service;

import org.springframework.stereotype.Service;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
/*
@Service
public class MatchService {

    public long differenceTime(Match match) throws ParseException {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toString();
        String matchTime = match.getStartTime().toString();

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d1 = format.parse(now);
        Date d2 = format.parse(matchTime);
        long sec = (d2.getTime() - d1.getTime()) / 1000;
        long min = (d2.getTime() - d1.getTime()) / 60000;
        long hour = (d2.getTime() - d1.getTime()) / 3600000;
        long days = sec / (24 * 60 * 60);

        return sec + min + hour + days;
    }
    
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ParticipationService participationService;

    public ResponseEntity<String> qrToAttendance(Long matchId, String userEmail) throws Exception {
        Match match = matchRepository.findById(matchId).get();
        Optional<Participation> participation = participationService.findByMatchAndUser(matchId, userEmail);

        long time = differenceTime(match);

        if (time > 30 * 40 || time < -10 * 40) {
            return ResponseEntity.badRequest().body("출석 체크 가능 시간이 아님");
        } else if (participation.isPresent() && participation.get().isAttendance()) {
            return ResponseEntity.badRequest().body("이미 출석 체크 완료");
        } else {
            return participationService.checkAttendance(matchId, userEmail);
        }
    }

    @Transactional
    public ResponseEntity<String> checkAttendance(Long matchId, String userEmail) {
        try {
            Match match = matchRepository.findById(matchId).get();
            User user = userRepository.findByEmail(userEmail).get();
            Participation participation = participationRepository.findByMatchAndUser(match, user).get();
            participation.setAttendance(true);
            int attendanceCount = match.getAttendanceCnt();
            match.setAttendanceCnt(attendanceCount + 1);
            return ResponseEntity.ok().body("출석 체크 완료");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("출석 체크 실패");
        }
    }
}
*/