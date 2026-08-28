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

public class hg implements ArgumentType<hg.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xe.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final ale h = ale.b("count");
   static final Map<ale, hg.a> i = Stream.of(new hg.a(h, $$0 -> true, dh.d.d.map($$0 -> $$1 -> $$0.d($$1.K()))))
      .collect(Collectors.toUnmodifiableMap(hg.a::a, $$0 -> (hg.a)$$0));
   static final Map<ale, hg.c> j = Stream.of(new hg.c(h, dh.d.d.map($$0 -> $$1 -> $$0.d($$1.K()))))
      .collect(Collectors.toUnmodifiableMap(hg.c::a, $$0 -> (hg.c)$$0));
   private final bnq<List<Predicate<cvs>>> k;

   public hg(eq $$0) {
      hg.b $$1 = new hg.b($$0);
      this.k = hb.a($$1);
   }

   public static hg a(eq $$0) {
      return new hg($$0);
   }

   public hg.d a(StringReader $$0) throws CommandSyntaxException {
      return ad.a(this.k.a($$0))::test;
   }

   public static hg.d a(CommandContext<eu> $$0, String $$1) {
      return (hg.d)$$0.getArgument($$1, hg.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(ale a, Predicate<cvs> b, Decoder<? extends Predicate<cvs>> c) {

      public static <T> hg.a a(ImmutableStringReader $$0, ale $$1, kr<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw hg.d.createWithContext($$0, $$1);
         } else {
            return new hg.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cvs> a(ImmutableStringReader $$0, alc<vd> $$1, vd $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cvs>> $$3 = this.c.parse($$1, $$2);
         return (Predicate<cvs>)$$3.getOrThrow($$1x -> hg.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements hb.b<Predicate<cvs>, hg.a, hg.c> {
      private final jq.b<cvn> a;
      private final jq.b<kr<?>> b;
      private final jq.b<ct.a<?>> c;
      private final alc<vd> d;

      b(jq.a $$0) {
         this.a = $$0.d(lw.K);
         this.b = $$0.d(lw.aA);
         this.c = $$0.d(lw.aC);
         this.d = $$0.a(uu.a);
      }

      public Predicate<cvs> e(ImmutableStringReader $$0, ale $$1) throws CommandSyntaxException {
         jo.c<cvn> $$2 = this.a.a(ald.a(lw.K, $$1)).orElseThrow(() -> hg.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cvs> f(ImmutableStringReader $$0, ale $$1) throws CommandSyntaxException {
         js<cvn> $$2 = this.a.a(axl.a(lw.K, $$1)).orElseThrow(() -> hg.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public hg.a g(ImmutableStringReader $$0, ale $$1) throws CommandSyntaxException {
         hg.a $$2 = hg.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            kr<?> $$3 = this.b.a(ald.a(lw.aA, $$1)).map(jo::a).orElseThrow(() -> hg.d.createWithContext($$0, $$1));
            return hg.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cvs> a(ImmutableStringReader $$0, hg.a $$1, vd $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cvs> a(ImmutableStringReader $$0, hg.a $$1) {
         return $$1.b;
      }

      public hg.c h(ImmutableStringReader $$0, ale $$1) throws CommandSyntaxException {
         hg.c $$2 = hg.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(ald.a(lw.aC, $$1)).map(hg.c::new).orElseThrow(() -> hg.f.createWithContext($$0, $$1));
      }

      public Predicate<cvs> a(ImmutableStringReader $$0, hg.c $$1, vd $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<ale> a() {
         return this.a.c_().map(ald::a);
      }

      @Override
      public Stream<ale> b() {
         return this.a.f().map(axl::b);
      }

      @Override
      public Stream<ale> c() {
         return Stream.concat(hg.i.keySet().stream(), this.b.c().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<ale> d() {
         return Stream.concat(hg.j.keySet().stream(), this.c.c_().map(ald::a));
      }

      public Predicate<cvs> a(Predicate<cvs> $$0) {
         return $$0.negate();
      }

      public Predicate<cvs> b(List<Predicate<cvs>> $$0) {
         return ad.b($$0);
      }
   }

   static record c(ale a, Decoder<? extends Predicate<cvs>> b) {
      public c(jo.c<ct.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cvs> a(ImmutableStringReader $$0, alc<vd> $$1, vd $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cvs>> $$3 = this.b.parse($$1, $$2);
         return (Predicate<cvs>)$$3.getOrThrow($$1x -> hg.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cvs> {
   }
}
