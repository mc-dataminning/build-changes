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

public class gqf implements aup {
   private static final Logger a = LogUtils.getLogger();
   private static final gqe b = new gqe("US", "English", false);
   private Map<String, gqe> c = ImmutableMap.of("en_us", b);
   private String d;

   public gqf(String $$0) {
      this.d = $$0;
   }

   private static Map<String, gqe> a(Stream<ata> $$0) {
      Map<String, gqe> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            gqr $$2 = $$1x.a(gqr.c);
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
   public void a(auo $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         gqe $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      gqb $$4 = gqb.a($$0, $$1, $$2);
      gqd.a($$4);
      um.a($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, gqe> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public gqe b(String $$0) {
      return this.c.get($$0);
   }
}
