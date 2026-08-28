import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class hdk {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dxp<dkd, dxo> i = new dxp.a<dkd, dxo>(dkf.a).a(dyf.a("map")).a(dkd::m, dxo::new);
   private static final alp j = alp.b("glow_item_frame");
   private static final alp k = alp.b("item_frame");
   private static final Map<alp, dxp<dkd, dxo>> l = Map.of(k, i, j, i);
   public static final hdw a = new hdw(j, "map=true");
   public static final hdw b = new hdw(j, "map=false");
   public static final hdw c = new hdw(k, "map=true");
   public static final hdw d = new hdw(k, "map=false");
   private final heb m;

   public hdk(heb $$0) {
      this.m = $$0;
   }

   public static Function<alp, dxp<dkd, dxo>> a() {
      Map<alp, dxp<dkd, dxo>> $$0 = new HashMap<>(l);

      for (dkd $$1 : ma.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public hdk.c a(alp $$0, dxp<dkd, dxo> $$1, List<hdk.a> $$2) {
      List<dxo> $$3 = $$1.a();
      Map<dxo, hdk.b> $$4 = new HashMap<>();
      Map<hdw, hdk.b> $$5 = new HashMap<>();

      try {
         for (hdk.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new hdk.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dxo $$10 = (dxo)var12.next();
               hdw $$11 = gmi.a($$0, $$10);
               hdk.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new hdk.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new hdk.c($$5);
   }

   public static record a(String a, gmt b) {
   }

   public static record b(dxo a, heb b) {
   }

   public static record c(Map<hdw, hdk.b> a) {
   }
}
