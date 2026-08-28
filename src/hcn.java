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

public class hcn implements avw {
   private static final Logger a = LogUtils.getLogger();
   private static final hcm b = new hcm("US", "English", false);
   private Map<String, hcm> c = ImmutableMap.of("en_us", b);
   private String d;
   private final Consumer<hcj> e;

   public hcn(String $$0, Consumer<hcj> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private static Map<String, hcm> a(Stream<aug> $$0) {
      Map<String, hcm> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            hcz $$2 = $$1x.a(hcz.c);
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
   public void a(avv $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         hcm $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      hcj $$4 = hcj.a($$0, $$1, $$2);
      hcl.a($$4);
      us.a($$4);
      this.e.accept($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, hcm> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public hcm b(String $$0) {
      return this.c.get($$0);
   }
}
