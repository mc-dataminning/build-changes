import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class hdi {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dxo<dke, dxn> i = new dxo.a<dke, dxn>(dkg.a).a(dye.a("map")).a(dke::m, dxn::new);
   private static final alz j = alz.b("glow_item_frame");
   private static final alz k = alz.b("item_frame");
   private static final Map<alz, dxo<dke, dxn>> l = Map.of(k, i, j, i);
   public static final hdu a = new hdu(j, "map=true");
   public static final hdu b = new hdu(j, "map=false");
   public static final hdu c = new hdu(k, "map=true");
   public static final hdu d = new hdu(k, "map=false");
   private final hdz m;

   public hdi(hdz $$0) {
      this.m = $$0;
   }

   public static Function<alz, dxo<dke, dxn>> a() {
      Map<alz, dxo<dke, dxn>> $$0 = new HashMap<>(l);

      for (dke $$1 : ma.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public hdi.c a(alz $$0, dxo<dke, dxn> $$1, List<hdi.a> $$2) {
      List<dxn> $$3 = $$1.a();
      Map<dxn, hdi.b> $$4 = new HashMap<>();
      Map<hdu, hdi.b> $$5 = new HashMap<>();

      try {
         for (hdi.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new hdi.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dxn $$10 = (dxn)var12.next();
               hdu $$11 = gmg.a($$0, $$10);
               hdi.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new hdi.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new hdi.c($$5);
   }

   public static record a(String a, gmr b) {
   }

   public static record b(dxn a, hdz b) {
   }

   public static record c(Map<hdu, hdi.b> a) {
   }
}
