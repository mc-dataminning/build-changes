import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gt implements ArgumentType<gt.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xe.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final akt h = new akt("count");
   static final Map<akt, gt.a> i = Stream.of(new gt.a(h, $$0 -> true, cu.d.d.map($$0 -> $$1 -> $$0.d($$1.G()))))
      .collect(Collectors.toUnmodifiableMap(gt.a::a, $$0 -> (gt.a)$$0));
   static final Map<akt, gt.c> j = Stream.of(new gt.c(h, cu.d.d.map($$0 -> $$1 -> $$0.d($$1.G()))))
      .collect(Collectors.toUnmodifiableMap(gt.c::a, $$0 -> (gt.c)$$0));
   private final bly<List<Predicate<cuh>>> k;

   public gt(ed $$0) {
      gt.b $$1 = new gt.b($$0);
      this.k = go.a($$1);
   }

   public static gt a(ed $$0) {
      return new gt($$0);
   }

   public gt.d a(StringReader $$0) throws CommandSyntaxException {
      return ad.a(this.k.a($$0))::test;
   }

   public static gt.d a(CommandContext<eh> $$0, String $$1) {
      return (gt.d)$$0.getArgument($$1, gt.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(akt a, Predicate<cuh> b, Decoder<? extends Predicate<cuh>> c) {

      public static <T> gt.a a(ImmutableStringReader $$0, akt $$1, kd<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw gt.d.createWithContext($$0, $$1);
         } else {
            return new gt.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cuh> a(ImmutableStringReader $$0, akr<vh> $$1, vh $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cuh>> $$3 = this.c.parse($$1, $$2);
         return ad.a((DataResult<Predicate<cuh>>)$$3, $$1x -> gt.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements go.b<Predicate<cuh>, gt.a, gt.c> {
      private final jc.b<cuc> a;
      private final jc.b<kd<?>> b;
      private final jc.b<cj.a<?>> c;
      private final akr<vh> d;

      b(jc.a $$0) {
         this.a = $$0.b(li.G);
         this.b = $$0.b(li.av);
         this.c = $$0.b(li.ax);
         this.d = $$0.a(uy.a);
      }

      public Predicate<cuh> e(ImmutableStringReader $$0, akt $$1) throws CommandSyntaxException {
         ja.c<cuc> $$2 = this.a.a(aks.a(li.G, $$1)).orElseThrow(() -> gt.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cuh> f(ImmutableStringReader $$0, akt $$1) throws CommandSyntaxException {
         je<cuc> $$2 = this.a.a(awt.a(li.G, $$1)).orElseThrow(() -> gt.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public gt.a g(ImmutableStringReader $$0, akt $$1) throws CommandSyntaxException {
         gt.a $$2 = gt.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            kd<?> $$3 = this.b.a(aks.a(li.av, $$1)).map(ja::a).orElseThrow(() -> gt.d.createWithContext($$0, $$1));
            return gt.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cuh> a(ImmutableStringReader $$0, gt.a $$1, vh $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cuh> a(ImmutableStringReader $$0, gt.a $$1) {
         return $$1.b;
      }

      public gt.c h(ImmutableStringReader $$0, akt $$1) throws CommandSyntaxException {
         gt.c $$2 = gt.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(aks.a(li.ax, $$1)).map(gt.c::new).orElseThrow(() -> gt.f.createWithContext($$0, $$1));
      }

      public Predicate<cuh> a(ImmutableStringReader $$0, gt.c $$1, vh $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<akt> a() {
         return this.a.c().map(aks::a);
      }

      @Override
      public Stream<akt> b() {
         return this.a.e().map(awt::b);
      }

      @Override
      public Stream<akt> c() {
         return Stream.concat(gt.i.keySet().stream(), this.b.b().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<akt> d() {
         return Stream.concat(gt.j.keySet().stream(), this.c.c().map(aks::a));
      }

      public Predicate<cuh> a(Predicate<cuh> $$0) {
         return $$0.negate();
      }

      public Predicate<cuh> b(List<Predicate<cuh>> $$0) {
         return ad.b($$0);
      }
   }

   static record c(akt a, Decoder<? extends Predicate<cuh>> b) {
      public c(ja.c<cj.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cuh> a(ImmutableStringReader $$0, akr<vh> $$1, vh $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cuh>> $$3 = this.b.parse($$1, $$2);
         return ad.a((DataResult<Predicate<cuh>>)$$3, $$1x -> gt.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cuh> {
   }
}
