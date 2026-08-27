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

public class fzt implements ann {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "en_us";
   private static final fzs c = new fzs("US", "English", false);
   private Map<String, fzs> d = ImmutableMap.of("en_us", c);
   private String e;

   public fzt(String $$0) {
      this.e = $$0;
   }

   private static Map<String, fzs> a(Stream<ama> $$0) {
      Map<String, fzs> $$1 = Maps.newHashMap();
      $$0.forEach($$1x -> {
         try {
            gaf $$2 = $$1x.a(gaf.c);
            if ($$2 != null) {
               $$2.a().forEach($$1::putIfAbsent);
            }
         } catch (IOException | RuntimeException var3) {
            b.warn("Unable to parse language metadata section of resourcepack: {}", $$1x.a(), var3);
         }
      });
      return ImmutableMap.copyOf($$1);
   }

   @Override
   public void a(anm $$0) {
      this.d = a($$0.b());
      List<String> $$1 = new ArrayList<>(2);
      boolean $$2 = c.d();
      $$1.add("en_us");
      if (!this.e.equals("en_us")) {
         fzs $$3 = this.d.get(this.e);
         if ($$3 != null) {
            $$1.add(this.e);
            $$2 = $$3.d();
         }
      }

      fzp $$4 = fzp.a($$0, $$1, $$2);
      fzr.a($$4);
      qm.a($$4);
   }

   public void a(String $$0) {
      this.e = $$0;
   }

   public String a() {
      return this.e;
   }

   public SortedMap<String, fzs> b() {
      return new TreeMap<>(this.d);
   }

   @Nullable
   public fzs b(String $$0) {
      return this.d.get($$0);
   }
}
