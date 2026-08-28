import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class hax {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dvp<dij, dvo> i = new dvp.a<dij, dvo>(dil.a).a(dwf.a("map")).a(dij::m, dvo::new);
   private static final all j = all.b("glow_item_frame");
   private static final all k = all.b("item_frame");
   private static final Map<all, dvp<dij, dvo>> l = Map.of(k, i, j, i);
   public static final hbj a = new hbj(j, "map=true");
   public static final hbj b = new hbj(j, "map=false");
   public static final hbj c = new hbj(k, "map=true");
   public static final hbj d = new hbj(k, "map=false");
   private final hbo m;

   public hax(hbo $$0) {
      this.m = $$0;
   }

   public static Function<all, dvp<dij, dvo>> a() {
      Map<all, dvp<dij, dvo>> $$0 = new HashMap<>(l);

      for (dij $$1 : lz.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public hax.c a(all $$0, dvp<dij, dvo> $$1, List<hax.a> $$2) {
      List<dvo> $$3 = $$1.a();
      Map<dvo, hax.b> $$4 = new HashMap<>();
      Map<hbj, hax.b> $$5 = new HashMap<>();

      try {
         for (hax.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new hax.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dvo $$10 = (dvo)var12.next();
               hbj $$11 = gjz.a($$0, $$10);
               hax.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new hax.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new hax.c($$5);
   }

   public static record a(String a, gkk b) {
   }

   public static record b(dvo a, hbo b) {
   }

   public static record c(Map<hbj, hax.b> a) {
   }
}
