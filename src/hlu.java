import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hlu extends avt<List<String>> {
   private static final alr a = alr.b("texts/splashes.txt");
   private static final bai b = bai.a();
   private final List<String> c = Lists.newArrayList();
   private final frc d;

   public hlu(frc $$0) {
      this.d = $$0;
   }

   protected List<String> a(avo $$0, brm $$1) {
      try {
         List var4;
         try (BufferedReader $$2 = fqq.Q().ac().openAsReader(a)) {
            var4 = $$2.lines().map(String::trim).filter($$0x -> $$0x.hashCode() != 125780783).collect(Collectors.toList());
         }

         return var4;
      } catch (IOException var8) {
         return Collections.emptyList();
      }
   }

   protected void a(List<String> $$0, avo $$1, brm $$2) {
      this.c.clear();
      this.c.addAll($$0);
   }

   @Nullable
   public fvc a() {
      Calendar $$0 = Calendar.getInstance();
      $$0.setTime(new Date());
      if ($$0.get(2) + 1 == 12 && $$0.get(5) == 24) {
         return fvc.a;
      } else if ($$0.get(2) + 1 == 1 && $$0.get(5) == 1) {
         return fvc.b;
      } else if ($$0.get(2) + 1 == 10 && $$0.get(5) == 31) {
         return fvc.c;
      } else if (this.c.isEmpty()) {
         return null;
      } else {
         return this.d != null && b.a(this.c.size()) == 42 ? new fvc(this.d.c().toUpperCase(Locale.ROOT) + " IS YOU") : new fvc(this.c.get(b.a(this.c.size())));
      }
   }
}
