import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class ko implements kv {
   public static final kv.a<ko> a = new kv.a<ko>() {
      public ko a(kw<ko> $$0, StringReader $$1, iy.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         return new ko($$0, fx.a(ld.e.p(), $$1, false).a());
      }
   };
   private final kw<ko> b;
   private final dqh c;

   public static Codec<ko> a(kw<ko> $$0) {
      return dqh.b.xmap($$1 -> new ko($$0, $$1), $$0x -> $$0x.c);
   }

   public static ys<? super wf, ko> b(kw<ko> $$0) {
      return yq.a(dde.q).a($$1 -> new ko($$0, $$1), $$0x -> $$0x.c);
   }

   public ko(kw<ko> $$0, dqh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(iy.a $$0) {
      return ld.j.b(this.a()) + " " + fx.a(this.c);
   }

   @Override
   public kw<ko> a() {
      return this.b;
   }

   public dqh b() {
      return this.c;
   }
}
