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

public class gqc extends auu<List<String>> {
   private static final alf a = new alf("texts/splashes.txt");
   private static final azh b = azh.a();
   private final List<String> c = Lists.newArrayList();
   private final ffu d;

   public gqc(ffu $$0) {
      this.d = $$0;
   }

   protected List<String> a(aup $$0, bnj $$1) {
      try {
         List var4;
         try (BufferedReader $$2 = ffg.Q().ab().openAsReader(a)) {
            var4 = $$2.lines().map(String::trim).filter($$0x -> $$0x.hashCode() != 125780783).collect(Collectors.toList());
         }

         return var4;
      } catch (IOException var8) {
         return Collections.emptyList();
      }
   }

   protected void a(List<String> $$0, aup $$1, bnj $$2) {
      this.c.clear();
      this.c.addAll($$0);
   }

   @Nullable
   public fij a() {
      Calendar $$0 = Calendar.getInstance();
      $$0.setTime(new Date());
      if ($$0.get(2) + 1 == 12 && $$0.get(5) == 24) {
         return fij.a;
      } else if ($$0.get(2) + 1 == 1 && $$0.get(5) == 1) {
         return fij.b;
      } else if ($$0.get(2) + 1 == 10 && $$0.get(5) == 31) {
         return fij.c;
      } else if (this.c.isEmpty()) {
         return null;
      } else {
         return this.d != null && b.a(this.c.size()) == 42 ? new fij(this.d.c().toUpperCase(Locale.ROOT) + " IS YOU") : new fij(this.c.get(b.a(this.c.size())));
      }
   }
}
