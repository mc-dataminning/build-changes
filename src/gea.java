import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gea implements bon {
   private final ger a;
   private final Set<bol> b = new ObjectOpenHashSet();
   private final bot c = new bot();

   public gea(LongSupplier $$0, ger $$1) {
      this.a = $$1;
      this.b.add(bou.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bou.a());
      this.b.add(bol.a("totalChunks", bok.f, this.a, ger::i));
      this.b.add(bol.a("renderedChunks", bok.f, this.a, ger::k));
      this.b.add(bol.a("lastViewDistance", bok.f, this.a, ger::j));
      ghu $$0 = this.a.h();
      this.b.add(bol.a("toUpload", bok.g, $$0, ghu::c));
      this.b.add(bol.a("freeBufferCount", bok.g, $$0, ghu::d));
      this.b.add(bol.a("toBatchCount", bok.g, $$0, ghu::b));
      if (fav.a().isPresent()) {
         this.b.add(bol.a("gpuUtilization", bok.i, fgi.Q(), fgi::v));
      }
   }

   @Override
   public Set<bol> a(Supplier<bnc> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
