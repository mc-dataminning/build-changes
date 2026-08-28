import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class hdp {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dxw<dkm, dxv> i = new dxw.a<dkm, dxv>(dko.a).a(dym.a("map")).a(dkm::m, dxv::new);
   private static final alz j = alz.b("glow_item_frame");
   private static final alz k = alz.b("item_frame");
   private static final Map<alz, dxw<dkm, dxv>> l = Map.of(k, i, j, i);
   public static final heb a = new heb(j, "map=true");
   public static final heb b = new heb(j, "map=false");
   public static final heb c = new heb(k, "map=true");
   public static final heb d = new heb(k, "map=false");
   private final heg m;

   public hdp(heg $$0) {
      this.m = $$0;
   }

   public static Function<alz, dxw<dkm, dxv>> a() {
      Map<alz, dxw<dkm, dxv>> $$0 = new HashMap<>(l);

      for (dkm $$1 : ma.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public hdp.c a(alz $$0, dxw<dkm, dxv> $$1, List<hdp.a> $$2) {
      List<dxv> $$3 = $$1.a();
      Map<dxv, hdp.b> $$4 = new HashMap<>();
      Map<heb, hdp.b> $$5 = new HashMap<>();

      try {
         for (hdp.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new hdp.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dxv $$10 = (dxv)var12.next();
               heb $$11 = gmn.a($$0, $$10);
               hdp.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new hdp.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new hdp.c($$5);
   }

   public static record a(String a, gmy b) {
   }

   public static record b(dxv a, heg b) {
   }

   public static record c(Map<heb, hdp.b> a) {
   }
}
