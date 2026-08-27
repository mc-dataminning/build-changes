import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public class gu<T, P> implements gm<T> {
   private final gu.a<T, P> a;
   private final List<P> b;
   private final gj<T> c;
   private int d;

   private gu(gu.a<T, P> $$0, List<P> $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new gj<>($$2, this);
   }

   @Override
   public void execute(gn<T> $$0, int $$1) throws CommandSyntaxException {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(gn<T> $$0, int $$1, List<P> $$2, gu.a<T, P> $$3) {
      int $$4 = $$2.size();
      if ($$4 != 0) {
         if ($$4 == 1) {
            $$0.a($$3.create($$1, $$2.get(0)));
         } else if ($$4 == 2) {
            $$0.a($$3.create($$1, $$2.get(0)));
            $$0.a($$3.create($$1, $$2.get(1)));
         } else {
            $$0.a((new gu<>($$3, $$2, $$1)).c);
         }
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      gj<T> create(int var1, P var2);
   }
}
