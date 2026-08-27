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

public class gcw extends apm<List<String>> {
   private static final agi a = new agi("texts/splashes.txt");
   private static final ats b = ats.a();
   private final List<String> c = Lists.newArrayList();
   private final ets d;

   public gcw(ets $$0) {
      this.d = $$0;
   }

   protected List<String> a(aph $$0, bfo $$1) {
      try {
         List var4;
         try (BufferedReader $$2 = etd.N().Y().openAsReader(a)) {
            var4 = $$2.lines().map(String::trim).filter($$0x -> $$0x.hashCode() != 125780783).collect(Collectors.toList());
         }

         return var4;
      } catch (IOException var8) {
         return Collections.emptyList();
      }
   }

   protected void a(List<String> $$0, aph $$1, bfo $$2) {
      this.c.clear();
      this.c.addAll($$0);
   }

   @Nullable
   public ewd a() {
      Calendar $$0 = Calendar.getInstance();
      $$0.setTime(new Date());
      if ($$0.get(2) + 1 == 12 && $$0.get(5) == 24) {
         return ewd.a;
      } else if ($$0.get(2) + 1 == 1 && $$0.get(5) == 1) {
         return ewd.b;
      } else if ($$0.get(2) + 1 == 10 && $$0.get(5) == 31) {
         return ewd.c;
      } else if (this.c.isEmpty()) {
         return null;
      } else {
         return this.d != null && b.a(this.c.size()) == 42 ? new ewd(this.d.c().toUpperCase(Locale.ROOT) + " IS YOU") : new ewd(this.c.get(b.a(this.c.size())));
      }
   }
}
