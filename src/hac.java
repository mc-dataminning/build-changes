import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hac implements avf {
   private static final Logger a = LogUtils.getLogger();
   private static final hab b = new hab("US", "English", false);
   private Map<String, hab> c = ImmutableMap.of("en_us", b);
   private String d;
   private final Consumer<gzy> e;

   public hac(String $$0, Consumer<gzy> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private static Map<String, hab> a(Stream<atp> $$0) {
      Map<String, hab> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            hao $$2 = $$1x.a(hao.c);
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
   public void a(ave $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         hab $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      gzy $$4 = gzy.a($$0, $$1, $$2);
      haa.a($$4);
      ui.a($$4);
      this.e.accept($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, hab> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public hab b(String $$0) {
      return this.c.get($$0);
   }
}
