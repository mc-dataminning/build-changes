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

public class gib implements asb {
   private static final Logger a = LogUtils.getLogger();
   private static final gia b = new gia("US", "English", false);
   private Map<String, gia> c = ImmutableMap.of("en_us", b);
   private String d;

   public gib(String $$0) {
      this.d = $$0;
   }

   private static Map<String, gia> a(Stream<aqo> $$0) {
      Map<String, gia> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            gin $$2 = $$1x.a(gin.c);
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
   public void a(asa $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         gia $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      ghx $$4 = ghx.a($$0, $$1, $$2);
      ghz.a($$4);
      sr.a($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, gia> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public gia b(String $$0) {
      return this.c.get($$0);
   }
}
