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

public class hj implements ArgumentType<hj.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wp.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wp.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wp.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final akv h = akv.b("count");
   static final Map<akv, hj.a> i = Stream.of(new hj.a(h, $$0 -> true, dk.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(hj.a::a, $$0 -> (hj.a)$$0));
   static final Map<akv, hj.c> j = Stream.of(new hj.c(h, dk.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(hj.c::a, $$0 -> (hj.c)$$0));
   private final bod<List<Predicate<cwq>>> k;

   public hj(et $$0) {
      hj.b $$1 = new hj.b($$0);
      this.k = he.a($$1);
   }

   public static hj a(et $$0) {
      return new hj($$0);
   }

   public hj.d a(StringReader $$0) throws CommandSyntaxException {
      return af.a(this.k.a($$0))::test;
   }

   public static hj.d a(CommandContext<ex> $$0, String $$1) {
      return (hj.d)$$0.getArgument($$1, hj.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(akv a, Predicate<cwq> b, Decoder<? extends Predicate<cwq>> c) {

      public static <T> hj.a a(ImmutableStringReader $$0, akv $$1, ku<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw hj.d.createWithContext($$0, $$1);
         } else {
            return new hj.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cwq> a(ImmutableStringReader $$0, akt<un> $$1, un $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cwq>> $$3 = this.c.parse($$1, $$2);
         return (Predicate<cwq>)$$3.getOrThrow($$1x -> hj.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements he.b<Predicate<cwq>, hj.a, hj.c> {
      private final jt.b<cwm> a;
      private final jt.b<ku<?>> b;
      private final jt.b<cw.a<?>> c;
      private final akt<un> d;

      b(jt.a $$0) {
         this.a = $$0.d(mc.K);
         this.b = $$0.d(mc.az);
         this.c = $$0.d(mc.aB);
         this.d = $$0.a(ue.a);
      }

      public Predicate<cwq> e(ImmutableStringReader $$0, akv $$1) throws CommandSyntaxException {
         jr.c<cwm> $$2 = this.a.a(aku.a(mc.K, $$1)).orElseThrow(() -> hj.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cwq> f(ImmutableStringReader $$0, akv $$1) throws CommandSyntaxException {
         jv<cwm> $$2 = this.a.a(axf.a(mc.K, $$1)).orElseThrow(() -> hj.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public hj.a g(ImmutableStringReader $$0, akv $$1) throws CommandSyntaxException {
         hj.a $$2 = hj.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            ku<?> $$3 = this.b.a(aku.a(mc.az, $$1)).map(jr::a).orElseThrow(() -> hj.d.createWithContext($$0, $$1));
            return hj.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cwq> a(ImmutableStringReader $$0, hj.a $$1, un $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cwq> a(ImmutableStringReader $$0, hj.a $$1) {
         return $$1.b;
      }

      public hj.c h(ImmutableStringReader $$0, akv $$1) throws CommandSyntaxException {
         hj.c $$2 = hj.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(aku.a(mc.aB, $$1)).map(hj.c::new).orElseThrow(() -> hj.f.createWithContext($$0, $$1));
      }

      public Predicate<cwq> a(ImmutableStringReader $$0, hj.c $$1, un $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<akv> a() {
         return this.a.c_().map(aku::a);
      }

      @Override
      public Stream<akv> b() {
         return this.a.f().map(axf::b);
      }

      @Override
      public Stream<akv> c() {
         return Stream.concat(hj.i.keySet().stream(), this.b.c().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<akv> d() {
         return Stream.concat(hj.j.keySet().stream(), this.c.c_().map(aku::a));
      }

      public Predicate<cwq> a(Predicate<cwq> $$0) {
         return $$0.negate();
      }

      public Predicate<cwq> b(List<Predicate<cwq>> $$0) {
         return af.b($$0);
      }
   }

   static record c(akv a, Decoder<? extends Predicate<cwq>> b) {
      public c(jr.c<cw.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cwq> a(ImmutableStringReader $$0, akt<un> $$1, un $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cwq>> $$3 = this.b.parse($$1, $$2);
         return (Predicate<cwq>)$$3.getOrThrow($$1x -> hj.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cwq> {
   }
}
