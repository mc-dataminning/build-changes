import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class hah {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dvk<die, dvj> i = new dvk.a<die, dvj>(dig.a).a(dwa.a("map")).a(die::m, dvj::new);
   private static final ali j = ali.b("glow_item_frame");
   private static final ali k = ali.b("item_frame");
   private static final Map<ali, dvk<die, dvj>> l = Map.of(k, i, j, i);
   public static final hat a = new hat(j, "map=true");
   public static final hat b = new hat(j, "map=false");
   public static final hat c = new hat(k, "map=true");
   public static final hat d = new hat(k, "map=false");
   private final hay m;

   public hah(hay $$0) {
      this.m = $$0;
   }

   public static Function<ali, dvk<die, dvj>> a() {
      Map<ali, dvk<die, dvj>> $$0 = new HashMap<>(l);

      for (die $$1 : ly.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public hah.c a(ali $$0, dvk<die, dvj> $$1, List<hah.a> $$2) {
      List<dvj> $$3 = $$1.a();
      Map<dvj, hah.b> $$4 = new HashMap<>();
      Map<hat, hah.b> $$5 = new HashMap<>();

      try {
         for (hah.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new hah.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dvj $$10 = (dvj)var12.next();
               hat $$11 = gjj.a($$0, $$10);
               hah.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new hah.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new hah.c($$5);
   }

   public static record a(String a, gju b) {
   }

   public static record b(dvj a, hay b) {
   }

   public static record c(Map<hat, hah.b> a) {
   }
}
