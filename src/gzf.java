import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class gzf {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dup<dhj, duo> i = new dup.a<dhj, duo>(dhl.a).a(dvf.a("map")).a(dhj::o, duo::new);
   private static final alc j = alc.b("glow_item_frame");
   private static final alc k = alc.b("item_frame");
   private static final Map<alc, dup<dhj, duo>> l = Map.of(k, i, j, i);
   public static final gzo a = new gzo(j, "map=true");
   public static final gzo b = new gzo(j, "map=false");
   public static final gzo c = new gzo(k, "map=true");
   public static final gzo d = new gzo(k, "map=false");
   private final gzt m;

   public gzf(gzt $$0) {
      this.m = $$0;
   }

   public static Function<alc, dup<dhj, duo>> a() {
      Map<alc, dup<dhj, duo>> $$0 = new HashMap<>(l);

      for (dhj $$1 : lu.e) {
         $$0.put($$1.s().h().a(), $$1.n());
      }

      return $$0::get;
   }

   public gzf.c a(alc $$0, dup<dhj, duo> $$1, List<gzf.a> $$2) {
      List<duo> $$3 = $$1.a();
      Map<duo, gzf.b> $$4 = new HashMap<>();
      Map<gzo, gzf.b> $$5 = new HashMap<>();

      try {
         for (gzf.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new gzf.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               duo $$10 = (duo)var12.next();
               gzo $$11 = gii.a($$0, $$10);
               gzf.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new gzf.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new gzf.c($$5);
   }

   public static record a(String a, gis b) {
   }

   public static record b(duo a, gzt b) {
   }

   public static record c(Map<gzo, gzf.b> a) {
   }
}
