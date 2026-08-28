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

public class gqi implements auq {
   private static final Logger a = LogUtils.getLogger();
   private static final gqh b = new gqh("US", "English", false);
   private Map<String, gqh> c = ImmutableMap.of("en_us", b);
   private String d;

   public gqi(String $$0) {
      this.d = $$0;
   }

   private static Map<String, gqh> a(Stream<atb> $$0) {
      Map<String, gqh> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            gqu $$2 = $$1x.a(gqu.c);
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
   public void a(aup $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         gqh $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      gqe $$4 = gqe.a($$0, $$1, $$2);
      gqg.a($$4);
      un.a($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, gqh> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public gqh b(String $$0) {
      return this.c.get($$0);
   }
}
