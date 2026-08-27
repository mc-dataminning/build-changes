import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class ks implements kz {
   public static final kz.a<ks> a = new kz.a<ks>() {
      public ks a(la<ks> $$0, StringReader $$1, jc.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         return new ks($$0, gb.a(lh.e.p(), $$1, false).a());
      }
   };
   private final la<ks> b;
   private final dtc c;

   public static Codec<ks> a(la<ks> $$0) {
      return dtc.b.xmap($$1 -> new ks($$0, $$1), $$0x -> $$0x.c);
   }

   public static zc<? super wp, ks> b(la<ks> $$0) {
      return za.a(dfc.q).a($$1 -> new ks($$0, $$1), $$0x -> $$0x.c);
   }

   public ks(la<ks> $$0, dtc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(jc.a $$0) {
      return lh.j.b(this.a()) + " " + gb.a(this.c);
   }

   @Override
   public la<ks> a() {
      return this.b;
   }

   public dtc b() {
      return this.c;
   }
}
