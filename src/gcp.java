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

public class gcp implements ape {
   private static final Logger a = LogUtils.getLogger();
   private static final gco b = new gco("US", "English", false);
   private Map<String, gco> c = ImmutableMap.of("en_us", b);
   private String d;

   public gcp(String $$0) {
      this.d = $$0;
   }

   private static Map<String, gco> a(Stream<anr> $$0) {
      Map<String, gco> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            gdb $$2 = $$1x.a(gdb.c);
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
   public void a(apd $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         gco $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      gcl $$4 = gcl.a($$0, $$1, $$2);
      gcn.a($$4);
      ru.a($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, gco> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public gco b(String $$0) {
      return this.c.get($$0);
   }
}
