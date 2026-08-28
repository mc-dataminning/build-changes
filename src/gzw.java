import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class gzw {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dve<dhy, dvd> i = new dve.a<dhy, dvd>(dia.a).a(dvu.a("map")).a(dhy::m, dvd::new);
   private static final alh j = alh.b("glow_item_frame");
   private static final alh k = alh.b("item_frame");
   private static final Map<alh, dve<dhy, dvd>> l = Map.of(k, i, j, i);
   public static final hai a = new hai(j, "map=true");
   public static final hai b = new hai(j, "map=false");
   public static final hai c = new hai(k, "map=true");
   public static final hai d = new hai(k, "map=false");
   private final han m;

   public gzw(han $$0) {
      this.m = $$0;
   }

   public static Function<alh, dve<dhy, dvd>> a() {
      Map<alh, dve<dhy, dvd>> $$0 = new HashMap<>(l);

      for (dhy $$1 : lx.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public gzw.c a(alh $$0, dve<dhy, dvd> $$1, List<gzw.a> $$2) {
      List<dvd> $$3 = $$1.a();
      Map<dvd, gzw.b> $$4 = new HashMap<>();
      Map<hai, gzw.b> $$5 = new HashMap<>();

      try {
         for (gzw.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new gzw.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dvd $$10 = (dvd)var12.next();
               hai $$11 = giy.a($$0, $$10);
               gzw.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new gzw.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new gzw.c($$5);
   }

   public static record a(String a, gjj b) {
   }

   public static record b(dvd a, han b) {
   }

   public static record c(Map<hai, gzw.b> a) {
   }
}
