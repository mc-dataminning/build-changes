import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jo implements jq {
   public static final jq.a<jo> a = new jq.a<jo>() {
      public jo a(jr<jo> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         ga.a $$2 = ga.a(jy.i.p(), $$1);
         ckj $$3 = new fz($$2.a(), $$2.b()).a(1, false);
         return new jo($$0, $$3);
      }

      public jo a(jr<jo> $$0, tl $$1) {
         return new jo($$0, $$1.r());
      }
   };
   private final jr<jo> b;
   private final ckj c;

   public static Codec<jo> a(jr<jo> $$0) {
      return ckj.a.xmap($$1 -> new jo($$0, $$1), $$0x -> $$0x.c);
   }

   public jo(jr<jo> $$0, ckj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return jy.k.b(this.b()) + " " + new fz(this.c.e(), this.c.v()).b();
   }

   @Override
   public jr<jo> b() {
      return this.b;
   }

   public ckj c() {
      return this.c;
   }
}
