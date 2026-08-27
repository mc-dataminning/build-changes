import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record xi(xn d, @Nullable xe e, xl f, @Nullable ws g, ww h) {
   public static final MapCodec<xi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xn.a.fieldOf("link").forGetter(xi::k),
               xe.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xl.a.forGetter(xi::m),
               wu.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               ww.a.optionalFieldOf("filter_mask", ww.c).forGetter(xi::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xi($$0x, (xe)$$1.orElse(null), $$2, (ws)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xi a(String $$0) {
      return a(i, $$0);
   }

   public static xi a(UUID $$0, String $$1) {
      xl $$2 = xl.a($$1);
      xn $$3 = xn.a($$0);
      return new xi($$3, null, $$2, null, ww.c);
   }

   public xi a(ws $$0) {
      ws $$1 = !$$0.equals(ws.b(this.c())) ? $$0 : null;
      return new xi(this.d, this.e, this.f, $$1, this.h);
   }

   public xi a() {
      return this.g != null ? new xi(this.d, this.e, this.f, null, this.h) : this;
   }

   public xi a(ww $$0) {
      return this.h.equals($$0) ? this : new xi(this.d, this.e, this.f, this.g, $$0);
   }

   public xi a(boolean $$0) {
      return this.a($$0 ? this.h : ww.c);
   }

   public xi b() {
      xl $$0 = xl.a(this.c());
      xn $$1 = xn.a(this.g());
      return new xi($$1, null, $$0, this.g, this.h);
   }

   public static void a(ayh.a $$0, xn $$1, xl $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(ayi $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public ws d() {
      return Objects.requireNonNullElseGet(this.g, () -> ws.b(this.c()));
   }

   public Instant e() {
      return this.f.b();
   }

   public long f() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.e().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.e().plus(c));
   }

   public UUID g() {
      return this.d.c();
   }

   public boolean h() {
      return this.g().equals(i);
   }

   public boolean i() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.i() && this.d.c().equals($$0);
   }

   public boolean j() {
      return this.h.b();
   }

   public xn k() {
      return this.d;
   }

   @Nullable
   public xe l() {
      return this.e;
   }

   public xl m() {
      return this.f;
   }

   @Nullable
   public ws n() {
      return this.g;
   }

   public ww o() {
      return this.h;
   }
}
