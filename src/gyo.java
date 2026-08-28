import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Logger;

public class gyo {
   private static final Logger e = LogUtils.getLogger();
   private static final String f = "map";
   private static final String g = "map=true";
   private static final String h = "map=false";
   private static final dub<dgv, dua> i = new dub.a<dgv, dua>(dgx.a).a(dur.a("map")).a(dgv::o, dua::new);
   private static final alb j = alb.b("glow_item_frame");
   private static final alb k = alb.b("item_frame");
   private static final Map<alb, dub<dgv, dua>> l = Map.of(k, i, j, i);
   public static final gyx a = new gyx(j, "map=true");
   public static final gyx b = new gyx(j, "map=false");
   public static final gyx c = new gyx(k, "map=true");
   public static final gyx d = new gyx(k, "map=false");
   private final gzc m;

   public gyo(gzc $$0) {
      this.m = $$0;
   }

   public static Function<alb, dub<dgv, dua>> a() {
      Map<alb, dub<dgv, dua>> $$0 = new HashMap<>(l);

      for (dgv $$1 : lu.e) {
         $$0.put($$1.s().h().a(), $$1.l());
      }

      return $$0::get;
   }

   public gyo.c a(alb $$0, dub<dgv, dua> $$1, List<gyo.a> $$2) {
      List<dua> $$3 = $$1.a();
      Map<dua, gyo.b> $$4 = new HashMap<>();
      Map<gyx, gyo.b> $$5 = new HashMap<>();

      try {
         for (gyo.a $$6 : $$2) {
            $$6.b.a($$1, $$0 + "/" + $$6.a).forEach(($$1x, $$2x) -> $$4.put($$1x, new gyo.b($$1x, $$2x)));
         }
      } finally {
         Iterator var12 = $$3.iterator();

         while (true) {
            if (!var12.hasNext()) {
               ;
            } else {
               dua $$10 = (dua)var12.next();
               gyx $$11 = ght.a($$0, $$10);
               gyo.b $$12 = $$4.get($$10);
               if ($$12 == null) {
                  e.warn("Missing blockstate definition: '{}' missing model for variant: '{}'", $$0, $$11);
                  $$12 = new gyo.b($$10, this.m);
               }

               $$5.put($$11, $$12);
            }
         }
      }

      return new gyo.c($$5);
   }

   public static record a(String a, gid b) {
   }

   public static record b(dua a, gzc b) {
   }

   public static record c(Map<gyx, gyo.b> a) {
   }
}
