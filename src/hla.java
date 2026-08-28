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

public class hla implements ave {
   private static final Logger a = LogUtils.getLogger();
   private static final hkz b = new hkz("US", "English", false);
   private Map<String, hkz> c = ImmutableMap.of("en_us", b);
   private String d;
   private final Consumer<hkw> e;

   public hla(String $$0, Consumer<hkw> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private static Map<String, hkz> a(Stream<atp> $$0) {
      Map<String, hkz> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            hlk $$2 = $$1x.a(hlk.c);
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
   public void a(avd $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         hkz $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      hkw $$4 = hkw.a($$0, $$1, $$2);
      hky.a($$4);
      tu.a($$4);
      this.e.accept($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, hkz> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public hkz b(String $$0) {
      return this.c.get($$0);
   }
}
