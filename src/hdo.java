import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class hdo {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dxv<dkl, dxu> i = new dxv.a<dkl, dxu>(dkn.a).a(dyl.a("map")).a(dkl::m, dxu::new);
   private static final alz j = alz.b("glow_item_frame");
   private static final alz k = alz.b("item_frame");
   private static final Map<alz, dxv<dkl, dxu>> l = Map.of(k, i, j, i);
   public static final hea a = new hea(j, "map=true");
   public static final hea b = new hea(j, "map=false");
   public static final hea c = new hea(k, "map=true");
   public static final hea d = new hea(k, "map=false");
   private final hef m;

   public hdo(hef $$0) {
      this.m = $$0;
   }

   public static Function<alz, dxv<dkl, dxu>> a() {
      Map<alz, dxv<dkl, dxu>> $$0 = new HashMap<>(l);

      for (dkl $$1 : ma.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public hdo.c a(alz $$0, dxv<dkl, dxu> $$1, List<hdo.a> $$2) {
      List<dxu> $$3 = $$1.a();
      Map<dxu, hdo.b> $$4 = new HashMap<>();
      Map<hea, hdo.b> $$5 = new HashMap<>();

      try {
         for (hdo.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new hdo.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dxu $$10 = (dxu)var12.next();
               hea $$11 = gmm.a($$0, $$10);
               hdo.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new hdo.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new hdo.c($$5);
   }

   public static record a(String a, gmx b) {
   }

   public static record b(dxu a, hef b) {
   }

   public static record c(Map<hea, hdo.b> a) {
   }
}
