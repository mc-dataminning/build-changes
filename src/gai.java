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

public class gai extends aoa<List<String>> {
   private static final aey a = new aey("texts/splashes.txt");
   private static final ase b = ase.a();
   private final List<String> c = Lists.newArrayList();
   private final erm d;

   public gai(erm $$0) {
      this.d = $$0;
   }

   protected List<String> a(anv $$0, bdr $$1) {
      try {
         List var4;
         try (BufferedReader $$2 = eqx.O().Z().openAsReader(a)) {
            var4 = $$2.lines().map(String::trim).filter($$0x -> $$0x.hashCode() != 125780783).collect(Collectors.toList());
         }

         return var4;
      } catch (IOException var8) {
         return Collections.emptyList();
      }
   }

   protected void a(List<String> $$0, anv $$1, bdr $$2) {
      this.c.clear();
      this.c.addAll($$0);
   }

   @Nullable
   public etv a() {
      Calendar $$0 = Calendar.getInstance();
      $$0.setTime(new Date());
      if ($$0.get(2) + 1 == 12 && $$0.get(5) == 24) {
         return etv.a;
      } else if ($$0.get(2) + 1 == 1 && $$0.get(5) == 1) {
         return etv.b;
      } else if ($$0.get(2) + 1 == 10 && $$0.get(5) == 31) {
         return etv.c;
      } else if (this.c.isEmpty()) {
         return null;
      } else {
         return this.d != null && b.a(this.c.size()) == 42 ? new etv(this.d.c().toUpperCase(Locale.ROOT) + " IS YOU") : new etv(this.c.get(b.a(this.c.size())));
      }
   }
}
