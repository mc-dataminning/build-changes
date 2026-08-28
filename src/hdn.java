import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class hdn {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dxv<dkl, dxu> i = new dxv.a<dkl, dxu>(dkn.a).a(dyl.a("map")).a(dkl::m, dxu::new);
   private static final alz j = alz.b("glow_item_frame");
   private static final alz k = alz.b("item_frame");
   private static final Map<alz, dxv<dkl, dxu>> l = Map.of(k, i, j, i);
   public static final hdz a = new hdz(j, "map=true");
   public static final hdz b = new hdz(j, "map=false");
   public static final hdz c = new hdz(k, "map=true");
   public static final hdz d = new hdz(k, "map=false");
   private final hee m;

   public hdn(hee $$0) {
      this.m = $$0;
   }

   public static Function<alz, dxv<dkl, dxu>> a() {
      Map<alz, dxv<dkl, dxu>> $$0 = new HashMap<>(l);

      for (dkl $$1 : ma.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public hdn.c a(alz $$0, dxv<dkl, dxu> $$1, List<hdn.a> $$2) {
      List<dxu> $$3 = $$1.a();
      Map<dxu, hdn.b> $$4 = new HashMap<>();
      Map<hdz, hdn.b> $$5 = new HashMap<>();

      try {
         for (hdn.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new hdn.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dxu $$10 = (dxu)var12.next();
               hdz $$11 = gml.a($$0, $$10);
               hdn.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new hdn.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new hdn.c($$5);
   }

   public static record a(String a, gmw b) {
   }

   public static record b(dxu a, hee b) {
   }

   public static record c(Map<hdz, hdn.b> a) {
   }
}
