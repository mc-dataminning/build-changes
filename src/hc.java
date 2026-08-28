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

public class hc implements ArgumentType<hc.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wu.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final akk h = new akk("count");
   static final Map<akk, hc.a> i = Stream.of(new hc.a(h, $$0 -> true, de.d.d.map($$0 -> $$1 -> $$0.d($$1.H()))))
      .collect(Collectors.toUnmodifiableMap(hc.a::a, $$0 -> (hc.a)$$0));
   static final Map<akk, hc.c> j = Stream.of(new hc.c(h, de.d.d.map($$0 -> $$1 -> $$0.d($$1.H()))))
      .collect(Collectors.toUnmodifiableMap(hc.c::a, $$0 -> (hc.c)$$0));
   private final bme<List<Predicate<cuc>>> k;

   public hc(em $$0) {
      hc.b $$1 = new hc.b($$0);
      this.k = gx.a($$1);
   }

   public static hc a(em $$0) {
      return new hc($$0);
   }

   public hc.d a(StringReader $$0) throws CommandSyntaxException {
      return ac.a(this.k.a($$0))::test;
   }

   public static hc.d a(CommandContext<eq> $$0, String $$1) {
      return (hc.d)$$0.getArgument($$1, hc.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(akk a, Predicate<cuc> b, Decoder<? extends Predicate<cuc>> c) {

      public static <T> hc.a a(ImmutableStringReader $$0, akk $$1, km<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw hc.d.createWithContext($$0, $$1);
         } else {
            return new hc.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cuc> a(ImmutableStringReader $$0, aki<uu> $$1, uu $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cuc>> $$3 = this.c.parse($$1, $$2);
         return (Predicate<cuc>)$$3.getOrThrow($$1x -> hc.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements gx.b<Predicate<cuc>, hc.a, hc.c> {
      private final jl.b<ctx> a;
      private final jl.b<km<?>> b;
      private final jl.b<cq.a<?>> c;
      private final aki<uu> d;

      b(jl.a $$0) {
         this.a = $$0.b(lr.K);
         this.b = $$0.b(lr.az);
         this.c = $$0.b(lr.aB);
         this.d = $$0.a(ul.a);
      }

      public Predicate<cuc> e(ImmutableStringReader $$0, akk $$1) throws CommandSyntaxException {
         jj.c<ctx> $$2 = this.a.a(akj.a(lr.K, $$1)).orElseThrow(() -> hc.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cuc> f(ImmutableStringReader $$0, akk $$1) throws CommandSyntaxException {
         jn<ctx> $$2 = this.a.a(awm.a(lr.K, $$1)).orElseThrow(() -> hc.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public hc.a g(ImmutableStringReader $$0, akk $$1) throws CommandSyntaxException {
         hc.a $$2 = hc.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            km<?> $$3 = this.b.a(akj.a(lr.az, $$1)).map(jj::a).orElseThrow(() -> hc.d.createWithContext($$0, $$1));
            return hc.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cuc> a(ImmutableStringReader $$0, hc.a $$1, uu $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cuc> a(ImmutableStringReader $$0, hc.a $$1) {
         return $$1.b;
      }

      public hc.c h(ImmutableStringReader $$0, akk $$1) throws CommandSyntaxException {
         hc.c $$2 = hc.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(akj.a(lr.aB, $$1)).map(hc.c::new).orElseThrow(() -> hc.f.createWithContext($$0, $$1));
      }

      public Predicate<cuc> a(ImmutableStringReader $$0, hc.c $$1, uu $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<akk> a() {
         return this.a.c().map(akj::a);
      }

      @Override
      public Stream<akk> b() {
         return this.a.e().map(awm::b);
      }

      @Override
      public Stream<akk> c() {
         return Stream.concat(hc.i.keySet().stream(), this.b.b().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<akk> d() {
         return Stream.concat(hc.j.keySet().stream(), this.c.c().map(akj::a));
      }

      public Predicate<cuc> a(Predicate<cuc> $$0) {
         return $$0.negate();
      }

      public Predicate<cuc> b(List<Predicate<cuc>> $$0) {
         return ac.b($$0);
      }
   }

   static record c(akk a, Decoder<? extends Predicate<cuc>> b) {
      public c(jj.c<cq.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cuc> a(ImmutableStringReader $$0, aki<uu> $$1, uu $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cuc>> $$3 = this.b.parse($$1, $$2);
         return (Predicate<cuc>)$$3.getOrThrow($$1x -> hc.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cuc> {
   }
}
