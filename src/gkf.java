import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public class gkf extends sv {
   private static final Logger b = LogUtils.getLogger();
   private final Map<String, String> c;
   private final boolean d;

   private gkf(Map<String, String> $$0, boolean $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public static gkf a(aso $$0, List<String> $$1, boolean $$2) {
      Map<String, String> $$3 = Maps.newHashMap();

      for (String $$4 : $$1) {
         String $$5 = String.format(Locale.ROOT, "lang/%s.json", $$4);

         for (String $$6 : $$0.a()) {
            try {
               ajh $$7 = new ajh($$6, $$5);
               a($$4, $$0.a($$7), $$3);
            } catch (Exception var10) {
               b.warn("Skipped language file: {}:{} ({})", new Object[]{$$6, $$5, var10.toString()});
            }
         }
      }

      return new gkf(ImmutableMap.copyOf($$3), $$2);
   }

   private static void a(String $$0, List<asm> $$1, Map<String, String> $$2) {
      for (asm $$3 : $$1) {
         try (InputStream $$4 = $$3.d()) {
            sv.a($$4, $$2::put);
         } catch (IOException var10) {
            b.warn("Failed to load translations for {} from pack {}", new Object[]{$$0, $$3.b(), var10});
         }
      }
   }

   @Override
   public String a(String $$0, String $$1) {
      return this.c.getOrDefault($$0, $$1);
   }

   @Override
   public boolean b(String $$0) {
      return this.c.containsKey($$0);
   }

   @Override
   public boolean b() {
      return this.d;
   }

   @Override
   public awi a(vz $$0) {
      return gkg.a($$0, this.d);
   }
}
