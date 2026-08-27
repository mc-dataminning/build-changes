import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gkg implements asp {
   private static final Logger a = LogUtils.getLogger();
   private static final gkf b = new gkf("US", "English", false);
   private Map<String, gkf> c = ImmutableMap.of("en_us", b);
   private String d;

   public gkg(String $$0) {
      this.d = $$0;
   }

   private static Map<String, gkf> a(Stream<ara> $$0) {
      Map<String, gkf> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            gks $$2 = $$1x.a(gks.c);
            if ($$2 != null) {
               $$2.a().forEach($$1::putIfAbsent);
            }
         } catch (IOException | RuntimeException var3) {
            a.warn("Unable to parse language metadata section of resourcepack: {}", $$1x.b(), var3);
         }
      });
      return ImmutableMap.copyOf($$1);
   }

   @Override
   public void a(aso $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         gkf $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      gkc $$4 = gkc.a($$0, $$1, $$2);
      gke.a($$4);
      sv.a($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, gkf> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public gkf b(String $$0) {
      return this.c.get($$0);
   }
}
