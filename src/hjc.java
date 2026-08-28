import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hjc {
   public static final hiz a = new hiz(hgr.d, ald.b("block/fire_0"));
   public static final hiz b = new hiz(hgr.d, ald.b("block/fire_1"));
   public static final hiz c = new hiz(hgr.d, ald.b("block/lava_flow"));
   public static final hiz d = new hiz(hgr.d, ald.b("block/water_flow"));
   public static final hiz e = new hiz(hgr.d, ald.b("block/water_overlay"));
   public static final hiz f = new hiz(got.c, ald.b("entity/banner_base"));
   public static final hiz g = new hiz(got.d, ald.b("entity/shield_base"));
   public static final hiz h = new hiz(got.d, ald.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<ald> j = IntStream.range(0, 10).mapToObj($$0 -> ald.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<ald> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<goi> l = k.stream().map(goi::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final ggz n;
   final Map<hjc.a, his> o = new HashMap<>();
   private final Map<hjh, gps> p;
   private final Map<ald, hdg> q;
   final Map<ald, hjn> r;
   final hjn s;

   public hjc(ggz $$0, Map<hjh, gps> $$1, Map<ald, hdg> $$2, Map<ald, hjn> $$3, hjn $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hjc.b a(hjc.d $$0) {
      his $$1 = hjn.a(this.s, new hjc.c($$0, () -> "missing"), hit.a);
      Map<hjh, his> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            his $$4x = $$3x.a(new hjc.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6x) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6x);
         }
      });
      hdk $$3 = new hdo($$1);
      Map<ald, hdk> $$4 = new HashMap<>(this.q.size());
      Map<ald, hdg.a> $$5 = new HashMap<>(this.q.size());
      this.q.forEach(($$4x, $$5x) -> {
         hjd $$6 = () -> $$4x + "#inventory";
         hjc.c $$7 = new hjc.c($$0, $$6);
         hdk.a $$8 = new hdk.a($$7, this.n, $$3);

         try {
            hdk $$9 = $$5x.a().a($$8);
            $$4.put($$4x, $$9);
            if (!$$5x.b().equals(hdg.a.a)) {
               $$5.put($$4x, $$5x.b());
            }
         } catch (Exception var11) {
            m.warn("Unable to bake item model: '{}'", $$4x, var11);
         }
      });
      return new hjc.b($$1, $$2, $$3, $$4, $$5);
   }

   static record a(ald a, j b, boolean c) {
   }

   public static record b(his a, Map<hjh, his> b, hdk c, Map<ald, hdk> d, Map<ald, hdg.a> e) {
   }

   class c implements hjb {
      private final hjd b;
      private final hjm c;

      c(final hjc.d $$0, final hjd $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hjm a() {
         return this.c;
      }

      private hjn a(ald $$0) {
         hjn $$1 = hjc.this.r.get($$0);
         if ($$1 == null) {
            hjc.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hjc.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public his a(ald $$0, hji $$1) {
         hjc.a $$2 = new hjc.a($$0, $$1.a(), $$1.b());
         his $$3 = hjc.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hjn $$4 = this.a($$0);
            his $$5 = hjn.a($$4, this, $$1);
            hjc.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hjd b() {
         return this.b;
      }
   }

   public interface d {
      hgs a(hjd var1, hiz var2);

      hgs a(hjd var1, String var2);

      default hjm a(final hjd $$0) {
         return new hjm() {
            @Override
            public hgs a(hiz $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public hgs a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
