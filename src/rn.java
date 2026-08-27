import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class rn implements rs {
   private static final Logger a = LogUtils.getLogger();
   private static final Escaper b = Escapers.builder()
      .addEscape('\'', "|'")
      .addEscape('\n', "|n")
      .addEscape('\r', "|r")
      .addEscape('|', "||")
      .addEscape('[', "|[")
      .addEscape(']', "|]")
      .build();

   @Override
   public void a(qz $$0) {
      String $$1 = b.escape($$0.c());
      String $$2 = b.escape($$0.n().getMessage());
      String $$3 = b.escape(ac.c($$0.n()));
      a.info("##teamcity[testStarted name='{}']", $$1);
      if ($$0.r()) {
         a.info("##teamcity[testFailed name='{}' message='{}' details='{}']", new Object[]{$$1, $$2, $$3});
      } else {
         a.info("##teamcity[testIgnored name='{}' message='{}' details='{}']", new Object[]{$$1, $$2, $$3});
      }

      a.info("##teamcity[testFinished name='{}' duration='{}']", $$1, $$0.l());
   }

   @Override
   public void b(qz $$0) {
      String $$1 = b.escape($$0.c());
      a.info("##teamcity[testStarted name='{}']", $$1);
      a.info("##teamcity[testFinished name='{}' duration='{}']", $$1, $$0.l());
   }
}
