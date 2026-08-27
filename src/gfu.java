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

public class gfu implements aqj {
   private static final Logger a = LogUtils.getLogger();
   private static final gft b = new gft("US", "English", false);
   private Map<String, gft> c = ImmutableMap.of("en_us", b);
   private String d;

   public gfu(String $$0) {
      this.d = $$0;
   }

   private static Map<String, gft> a(Stream<aow> $$0) {
      Map<String, gft> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            ggg $$2 = $$1x.a(ggg.c);
            if ($$2 != null) {
               $$2.a().forEach($$1::putIfAbsent);
            }
         } catch (IOException | RuntimeException var3) {
            a.warn("Unable to parse language metadata section of resourcepack: {}", $$1x.a(), var3);
         }
      });
      return ImmutableMap.copyOf($$1);
   }

   @Override
   public void a(aqi $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         gft $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      gfq $$4 = gfq.a($$0, $$1, $$2);
      gfs.a($$4);
      si.a($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, gft> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public gft b(String $$0) {
      return this.c.get($$0);
   }
}
