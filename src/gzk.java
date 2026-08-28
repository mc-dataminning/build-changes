import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class gzk {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dut<dhm, dus> i = new dut.a<dhm, dus>(dho.a).a(dvj.a("map")).a(dhm::n, dus::new);
   private static final ale j = ale.b("glow_item_frame");
   private static final ale k = ale.b("item_frame");
   private static final Map<ale, dut<dhm, dus>> l = Map.of(k, i, j, i);
   public static final gzt a = new gzt(j, "map=true");
   public static final gzt b = new gzt(j, "map=false");
   public static final gzt c = new gzt(k, "map=true");
   public static final gzt d = new gzt(k, "map=false");
   private final gzy m;

   public gzk(gzy $$0) {
      this.m = $$0;
   }

   public static Function<ale, dut<dhm, dus>> a() {
      Map<ale, dut<dhm, dus>> $$0 = new HashMap<>(l);

      for (dhm $$1 : lv.e) {
         $$0.put($$1.r().h().a(), $$1.k());
      }

      return $$0::get;
   }

   public gzk.c a(ale $$0, dut<dhm, dus> $$1, List<gzk.a> $$2) {
      List<dus> $$3 = $$1.a();
      Map<dus, gzk.b> $$4 = new HashMap<>();
      Map<gzt, gzk.b> $$5 = new HashMap<>();

      try {
         for (gzk.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new gzk.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dus $$10 = (dus)var12.next();
               gzt $$11 = gin.a($$0, $$10);
               gzk.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new gzk.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new gzk.c($$5);
   }

   public static record a(String a, gix b) {
   }

   public static record b(dus a, gzy b) {
   }

   public static record c(Map<gzt, gzk.b> a) {
   }
}
