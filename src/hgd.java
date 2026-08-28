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

public class hgd implements auq {
   private static final Logger a = LogUtils.getLogger();
   private static final hgc b = new hgc("US", "English", false);
   private Map<String, hgc> c = ImmutableMap.of("en_us", b);
   private String d;
   private final Consumer<hfz> e;

   public hgd(String $$0, Consumer<hfz> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private static Map<String, hgc> a(Stream<atc> $$0) {
      Map<String, hgc> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            hgn $$2 = $$1x.a(hgn.c);
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
         hgc $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      hfz $$4 = hfz.a($$0, $$1, $$2);
      hgb.a($$4);
      tl.a($$4);
      this.e.accept($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, hgc> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public hgc b(String $$0) {
      return this.c.get($$0);
   }
}
