import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;
import java.util.stream.Stream;

public class sn<T> implements si, sq {
   static final sq a = Stream::empty;
   static final si b = Stream::empty;
   private final sq c;
   private final si d;
   private final du e;
   private final Function<sn<T>, T> f;

   @Override
   public Stream<ib> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   sn(du $$0, Function<sn<T>, T> $$1, sq $$2, si $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public du a() {
      return this.e;
   }

   @Override
   public Stream<so> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<sn<T>, T> a;

      public a(Function<sn<T>, T> $$0) {
         this.a = $$0;
      }

      public T a(CommandContext<du> $$0, int $$1) {
         du $$2 = (du)$$0.getSource();
         return new sn<>($$2, this.a, sn.a, () -> sk.a($$1, $$2.d(), $$2.e())).b();
      }

      public T a(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         ib $$2 = ib.a($$1.d());
         return new sn<>($$1, this.a, sn.a, () -> sk.b($$2, 15, $$1.e()).stream()).b();
      }

      public T b(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         ib $$2 = ib.a($$1.d());
         return new sn<>($$1, this.a, sn.a, () -> sk.c($$2, 200, $$1.e())).b();
      }

      public T c(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         return new sn<>($$1, this.a, sn.a, () -> sk.a(ib.a($$1.d()), $$1.i().K(), $$1.e())).b();
      }

      public T d(CommandContext<du> $$0) {
         return new sn<>((du)$$0.getSource(), this.a, () -> rw.a().stream(), sn.b).b();
      }

      public T a(CommandContext<du> $$0, String $$1) {
         return new sn<>((du)$$0.getSource(), this.a, () -> rw.a($$1), sn.b).b();
      }

      public T a(CommandContext<du> $$0, boolean $$1) {
         return new sn<>((du)$$0.getSource(), this.a, () -> rw.c().filter($$1x -> !$$1 || $$1x.h()), sn.b).b();
      }

      public T b(CommandContext<du> $$0, String $$1) {
         return new sn<>((du)$$0.getSource(), this.a, () -> Stream.of(sp.a($$0, $$1)), sn.b).b();
      }

      public T e(CommandContext<du> $$0) {
         return this.a($$0, false);
      }
   }
}
