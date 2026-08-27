import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;
import java.util.stream.Stream;

public class sp<T> implements sk, ss {
   static final ss a = Stream::empty;
   static final sk b = Stream::empty;
   private final ss c;
   private final sk d;
   private final du e;
   private final Function<sp<T>, T> f;

   @Override
   public Stream<ib> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   sp(du $$0, Function<sp<T>, T> $$1, ss $$2, sk $$3) {
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
   public Stream<sq> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<sp<T>, T> a;

      public a(Function<sp<T>, T> $$0) {
         this.a = $$0;
      }

      public T a(CommandContext<du> $$0, int $$1) {
         du $$2 = (du)$$0.getSource();
         return new sp<>($$2, this.a, sp.a, () -> sm.a($$1, $$2.d(), $$2.e())).b();
      }

      public T a(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         ib $$2 = ib.a($$1.d());
         return new sp<>($$1, this.a, sp.a, () -> sm.b($$2, 15, $$1.e()).stream()).b();
      }

      public T b(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         ib $$2 = ib.a($$1.d());
         return new sp<>($$1, this.a, sp.a, () -> sm.c($$2, 200, $$1.e())).b();
      }

      public T c(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         return new sp<>($$1, this.a, sp.a, () -> sm.a(ib.a($$1.d()), $$1.i().K(), $$1.e())).b();
      }

      public T d(CommandContext<du> $$0) {
         return new sp<>((du)$$0.getSource(), this.a, () -> ry.a().stream(), sp.b).b();
      }

      public T a(CommandContext<du> $$0, String $$1) {
         return new sp<>((du)$$0.getSource(), this.a, () -> ry.a($$1), sp.b).b();
      }

      public T a(CommandContext<du> $$0, boolean $$1) {
         return new sp<>((du)$$0.getSource(), this.a, () -> ry.c().filter($$1x -> !$$1 || $$1x.h()), sp.b).b();
      }

      public T b(CommandContext<du> $$0, String $$1) {
         return new sp<>((du)$$0.getSource(), this.a, () -> Stream.of(sr.a($$0, $$1)), sp.b).b();
      }

      public T e(CommandContext<du> $$0) {
         return this.a($$0, false);
      }
   }
}
