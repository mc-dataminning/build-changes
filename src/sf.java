import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public class sf extends sp {
   public static final MapCodec<sf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(md.aF.r().fieldOf("function").forGetter(sf::q), ti.a.forGetter(sp::n)).apply($$0, sf::new)
   );
   private final js<Consumer<sn>> c;

   public sf(js<Consumer<sn>> $$0, ti<js<tj>> $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(sn $$0) {
      this.c.a().accept($$0);
   }

   private js<Consumer<sn>> q() {
      return this.c;
   }

   @Override
   public MapCodec<sf> a() {
      return a;
   }

   @Override
   protected xj b() {
      return wv.c("test_instance.type.function");
   }

   @Override
   public wv c() {
      return this.o().b(this.a("test_instance.description.function", this.c.g())).b(this.p());
   }
}
