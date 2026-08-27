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

public class gai implements anx {
   private static final Logger a = LogUtils.getLogger();
   private static final gah b = new gah("US", "English", false);
   private Map<String, gah> c = ImmutableMap.of("en_us", b);
   private String d;

   public gai(String $$0) {
      this.d = $$0;
   }

   private static Map<String, gah> a(Stream<amk> $$0) {
      Map<String, gah> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            gau $$2 = $$1x.a(gau.c);
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
   public void a(anw $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         gah $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      gae $$4 = gae.a($$0, $$1, $$2);
      gag.a($$4);
      qr.a($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, gah> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public gah b(String $$0) {
      return this.c.get($$0);
   }
}
