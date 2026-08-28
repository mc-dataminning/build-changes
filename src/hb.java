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

public class hb implements ArgumentType<hb.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xo.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final ale h = new ale("count");
   static final Map<ale, hb.a> i = Stream.of(new hb.a(h, $$0 -> true, de.d.d.map($$0 -> $$1 -> $$0.d($$1.I()))))
      .collect(Collectors.toUnmodifiableMap(hb.a::a, $$0 -> (hb.a)$$0));
   static final Map<ale, hb.c> j = Stream.of(new hb.c(h, de.d.d.map($$0 -> $$1 -> $$0.d($$1.I()))))
      .collect(Collectors.toUnmodifiableMap(hb.c::a, $$0 -> (hb.c)$$0));
   private final bmr<List<Predicate<cuo>>> k;

   public hb(el $$0) {
      hb.b $$1 = new hb.b($$0);
      this.k = gw.a($$1);
   }

   public static hb a(el $$0) {
      return new hb($$0);
   }

   public hb.d a(StringReader $$0) throws CommandSyntaxException {
      return ac.a(this.k.a($$0))::test;
   }

   public static hb.d a(CommandContext<ep> $$0, String $$1) {
      return (hb.d)$$0.getArgument($$1, hb.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(ale a, Predicate<cuo> b, Decoder<? extends Predicate<cuo>> c) {

      public static <T> hb.a a(ImmutableStringReader $$0, ale $$1, kl<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw hb.d.createWithContext($$0, $$1);
         } else {
            return new hb.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cuo> a(ImmutableStringReader $$0, alc<vo> $$1, vo $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cuo>> $$3 = this.c.parse($$1, $$2);
         return (Predicate<cuo>)$$3.getOrThrow($$1x -> hb.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements gw.b<Predicate<cuo>, hb.a, hb.c> {
      private final jk.b<cuj> a;
      private final jk.b<kl<?>> b;
      private final jk.b<cq.a<?>> c;
      private final alc<vo> d;

      b(jk.a $$0) {
         this.a = $$0.b(lq.G);
         this.b = $$0.b(lq.av);
         this.c = $$0.b(lq.ax);
         this.d = $$0.a(vf.a);
      }

      public Predicate<cuo> e(ImmutableStringReader $$0, ale $$1) throws CommandSyntaxException {
         ji.c<cuj> $$2 = this.a.a(ald.a(lq.G, $$1)).orElseThrow(() -> hb.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cuo> f(ImmutableStringReader $$0, ale $$1) throws CommandSyntaxException {
         jm<cuj> $$2 = this.a.a(axe.a(lq.G, $$1)).orElseThrow(() -> hb.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public hb.a g(ImmutableStringReader $$0, ale $$1) throws CommandSyntaxException {
         hb.a $$2 = hb.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            kl<?> $$3 = this.b.a(ald.a(lq.av, $$1)).map(ji::a).orElseThrow(() -> hb.d.createWithContext($$0, $$1));
            return hb.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cuo> a(ImmutableStringReader $$0, hb.a $$1, vo $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cuo> a(ImmutableStringReader $$0, hb.a $$1) {
         return $$1.b;
      }

      public hb.c h(ImmutableStringReader $$0, ale $$1) throws CommandSyntaxException {
         hb.c $$2 = hb.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(ald.a(lq.ax, $$1)).map(hb.c::new).orElseThrow(() -> hb.f.createWithContext($$0, $$1));
      }

      public Predicate<cuo> a(ImmutableStringReader $$0, hb.c $$1, vo $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<ale> a() {
         return this.a.c().map(ald::a);
      }

      @Override
      public Stream<ale> b() {
         return this.a.e().map(axe::b);
      }

      @Override
      public Stream<ale> c() {
         return Stream.concat(hb.i.keySet().stream(), this.b.b().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<ale> d() {
         return Stream.concat(hb.j.keySet().stream(), this.c.c().map(ald::a));
      }

      public Predicate<cuo> a(Predicate<cuo> $$0) {
         return $$0.negate();
      }

      public Predicate<cuo> b(List<Predicate<cuo>> $$0) {
         return ac.b($$0);
      }
   }

   static record c(ale a, Decoder<? extends Predicate<cuo>> b) {
      public c(ji.c<cq.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cuo> a(ImmutableStringReader $$0, alc<vo> $$1, vo $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cuo>> $$3 = this.b.parse($$1, $$2);
         return (Predicate<cuo>)$$3.getOrThrow($$1x -> hb.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cuo> {
   }
}
