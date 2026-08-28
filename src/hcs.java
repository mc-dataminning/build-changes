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

public class hcs implements avw {
   private static final Logger a = LogUtils.getLogger();
   private static final hcr b = new hcr("US", "English", false);
   private Map<String, hcr> c = ImmutableMap.of("en_us", b);
   private String d;
   private final Consumer<hco> e;

   public hcs(String $$0, Consumer<hco> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private static Map<String, hcr> a(Stream<aug> $$0) {
      Map<String, hcr> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            hde $$2 = $$1x.a(hde.c);
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
         hcr $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      hco $$4 = hco.a($$0, $$1, $$2);
      hcq.a($$4);
      us.a($$4);
      this.e.accept($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, hcr> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public hcr b(String $$0) {
      return this.c.get($$0);
   }
}
