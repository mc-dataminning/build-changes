import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jp implements jv {
   public static final jv.a<jp> a = new jv.a<jp>() {
      public jp a(jw<jp> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         return new jp($$0, fk.a(kd.e.p(), $$1, false).a());
      }

      public jp a(jw<jp> $$0, ui $$1) {
         return new jp($$0, $$1.a(cwq.q));
      }
   };
   private final jw<jp> b;
   private final djh c;

   public static Codec<jp> a(jw<jp> $$0) {
      return djh.b.xmap($$1 -> new jp($$0, $$1), $$0x -> $$0x.c);
   }

   public jp(jw<jp> $$0, djh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ui $$0) {
      $$0.a(cwq.q, this.c);
   }

   @Override
   public String a() {
      return kd.j.b(this.b()) + " " + fk.a(this.c);
   }

   @Override
   public jw<jp> b() {
      return this.b;
   }

   public djh c() {
      return this.c;
   }
}
