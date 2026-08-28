import com.google.common.collect.Maps;
import java.util.Map;

public class gus extends guj<cig, hat, gea> {
   private final Map<cih.a, gbp<gea>> a;

   public gus(gtd.a $$0) {
      super($$0, new gea($$0.a(ggb.bR)), 0.7F);
      this.a = a($$0);
      this.a(new gxt<>(this, new gea($$0.a(ggb.ce)), new gea($$0.a(ggb.cd)), aku.b("textures/entity/pig/pig_saddle.png")));
   }

   private static Map<cih.a, gbp<gea>> a(gtd.a $$0) {
      return Maps.newEnumMap(
         Map.of(cih.a.a, new gbp<>(new gea($$0.a(ggb.bR)), new gea($$0.a(ggb.cc))), cih.a.b, new gbp<>(new gcp($$0.a(ggb.aa)), new gcp($$0.a(ggb.ab))))
      );
   }

   public void a(hat $$0, fgr $$1, gmx $$2, int $$3) {
      if ($$0.b != null) {
         this.h = this.a.get($$0.b.a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public aku a(hat $$0) {
      return $$0.b == null ? hfg.c() : $$0.b.b();
   }

   public hat b() {
      return new hat();
   }

   public void a(cig $$0, hat $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.t().a();
   }
}
