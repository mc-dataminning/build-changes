import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;
import java.util.stream.Stream;

public class sl<T> implements sg, so {
   static final so a = Stream::empty;
   static final sg b = Stream::empty;
   private final so c;
   private final sg d;
   private final du e;
   private final Function<sl<T>, T> f;

   @Override
   public Stream<hz> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   sl(du $$0, Function<sl<T>, T> $$1, so $$2, sg $$3) {
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
   public Stream<sm> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<sl<T>, T> a;

      public a(Function<sl<T>, T> $$0) {
         this.a = $$0;
      }

      public T a(CommandContext<du> $$0, int $$1) {
         du $$2 = (du)$$0.getSource();
         return new sl<>($$2, this.a, sl.a, () -> si.a($$1, $$2.d(), $$2.e())).b();
      }

      public T a(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         hz $$2 = hz.a($$1.d());
         return new sl<>($$1, this.a, sl.a, () -> si.b($$2, 15, $$1.e()).stream()).b();
      }

      public T b(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         hz $$2 = hz.a($$1.d());
         return new sl<>($$1, this.a, sl.a, () -> si.c($$2, 200, $$1.e())).b();
      }

      public T c(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         return new sl<>($$1, this.a, sl.a, () -> si.a(hz.a($$1.d()), $$1.i().K(), $$1.e())).b();
      }

      public T d(CommandContext<du> $$0) {
         return new sl<>((du)$$0.getSource(), this.a, () -> ru.a().stream(), sl.b).b();
      }

      public T a(CommandContext<du> $$0, String $$1) {
         return new sl<>((du)$$0.getSource(), this.a, () -> ru.a($$1), sl.b).b();
      }

      public T a(CommandContext<du> $$0, boolean $$1) {
         return new sl<>((du)$$0.getSource(), this.a, () -> ru.c().filter($$1x -> !$$1 || $$1x.h()), sl.b).b();
      }

      public T b(CommandContext<du> $$0, String $$1) {
         return new sl<>((du)$$0.getSource(), this.a, () -> Stream.of(sn.a($$0, $$1)), sl.b).b();
      }

      public T e(CommandContext<du> $$0) {
         return this.a($$0, false);
      }
   }
}
