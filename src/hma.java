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

public class hma implements avp {
   private static final Logger a = LogUtils.getLogger();
   private static final hlz b = new hlz("US", "English", false);
   private Map<String, hlz> c = ImmutableMap.of("en_us", b);
   private String d;
   private final Consumer<hlw> e;

   public hma(String $$0, Consumer<hlw> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private static Map<String, hlz> a(Stream<aua> $$0) {
      Map<String, hlz> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            hmk $$2 = $$1x.a(hmk.c);
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
   public void a(avo $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         hlz $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      hlw $$4 = hlw.a($$0, $$1, $$2);
      hly.a($$4);
      tv.a($$4);
      this.e.accept($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, hlz> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public hlz b(String $$0) {
      return this.c.get($$0);
   }
}
