import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class hbi {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dvw<diq, dvv> i = new dvw.a<diq, dvv>(dis.a).a(dwm.a("map")).a(diq::m, dvv::new);
   private static final alj j = alj.b("glow_item_frame");
   private static final alj k = alj.b("item_frame");
   private static final Map<alj, dvw<diq, dvv>> l = Map.of(k, i, j, i);
   public static final hbu a = new hbu(j, "map=true");
   public static final hbu b = new hbu(j, "map=false");
   public static final hbu c = new hbu(k, "map=true");
   public static final hbu d = new hbu(k, "map=false");
   private final hbz m;

   public hbi(hbz $$0) {
      this.m = $$0;
   }

   public static Function<alj, dvw<diq, dvv>> a() {
      Map<alj, dvw<diq, dvv>> $$0 = new HashMap<>(l);

      for (diq $$1 : lz.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public hbi.c a(alj $$0, dvw<diq, dvv> $$1, List<hbi.a> $$2) {
      List<dvv> $$3 = $$1.a();
      Map<dvv, hbi.b> $$4 = new HashMap<>();
      Map<hbu, hbi.b> $$5 = new HashMap<>();

      try {
         for (hbi.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new hbi.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dvv $$10 = (dvv)var12.next();
               hbu $$11 = gki.a($$0, $$10);
               hbi.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new hbi.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new hbi.c($$5);
   }

   public static record a(String a, gkt b) {
   }

   public static record b(dvv a, hbz b) {
   }

   public static record c(Map<hbu, hbi.b> a) {
   }
}
