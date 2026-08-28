import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public class sg extends sq {
   public static final MapCodec<sg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.aE.r().fieldOf("function").forGetter(sg::q), tj.a.forGetter(sq::n)).apply($$0, sg::new)
   );
   private final je<Consumer<so>> c;

   public sg(je<Consumer<so>> $$0, tj<je<tk>> $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(so $$0) {
      this.c.a().accept($$0);
   }

   private je<Consumer<so>> q() {
      return this.c;
   }

   @Override
   public MapCodec<sg> a() {
      return a;
   }

   @Override
   protected xk b() {
      return ww.c("test_instance.type.function");
   }

   @Override
   public ww c() {
      return this.o().b(this.a("test_instance.description.function", this.c.g())).b(this.p());
   }
}
