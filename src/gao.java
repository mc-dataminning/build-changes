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

public class gao implements anw {
   private static final Logger a = LogUtils.getLogger();
   private static final gan b = new gan("US", "English", false);
   private Map<String, gan> c = ImmutableMap.of("en_us", b);
   private String d;

   public gao(String $$0) {
      this.d = $$0;
   }

   private static Map<String, gan> a(Stream<amj> $$0) {
      Map<String, gan> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            gba $$2 = $$1x.a(gba.c);
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
   public void a(anv $$0) {
      this.c = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = b.d();
      $$1.add("en_us");
      if (!this.d.equals("en_us")) {
         gan $$3 = this.c.get(this.d);
         if ($$3 != null) {
            $$1.add(this.d);
            $$2 = $$3.d();
         }
      }

      gak $$4 = gak.a($$0, $$1, $$2);
      gam.a($$4);
      qt.a($$4);
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public String a() {
      return this.d;
   }

   public SortedMap<String, gan> b() {
      return new TreeMap<>(this.c);
   }

   @Nullable
   public gan b(String $$0) {
      return this.c.get($$0);
   }
}
