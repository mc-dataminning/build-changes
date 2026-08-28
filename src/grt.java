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

public class grt implements auf {
   private static final Logger a = LogUtils.getLogger();
   private static final grs b = new grs("US", "English", false);
   private Map<String, grs> c = ImmutableMap.of("en_us", b);
   private String d;
   private final Consumer<grp> e;

   public grt(String $$0, Consumer<grp> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private static Map<String, grs> a(Stream<asq> $$0) {
      Map<String, grs> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            gsf $$2 = $$1x.a(gsf.c);
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
   public void a(aue $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         grs $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      grp $$4 = grp.a($$0, $$1, $$2);
      grr.a($$4);
      tw.a($$4);
      this.e.accept($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, grs> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public grs b(String $$0) {
      return this.c.get($$0);
   }
}
