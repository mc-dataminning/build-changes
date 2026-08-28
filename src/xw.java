import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record xw(yb d, @Nullable xs e, xz f, @Nullable xg g, xk h) {
   public static final MapCodec<xw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               yb.a.fieldOf("link").forGetter(xw::k),
               xs.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xz.a.forGetter(xw::m),
               xi.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xk.a.optionalFieldOf("filter_mask", xk.c).forGetter(xw::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xw($$0x, (xs)$$1.orElse(null), $$2, (xg)$$3.orElse(null), $$4))
   );
   private static final UUID i = ag.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xw a(String $$0) {
      return a(i, $$0);
   }

   public static xw a(UUID $$0, String $$1) {
      xz $$2 = xz.a($$1);
      yb $$3 = yb.a($$0);
      return new xw($$3, null, $$2, null, xk.c);
   }

   public xw a(xg $$0) {
      xg $$1 = !$$0.equals(xg.b(this.c())) ? $$0 : null;
      return new xw(this.d, this.e, this.f, $$1, this.h);
   }

   public xw a() {
      return this.g != null ? new xw(this.d, this.e, this.f, null, this.h) : this;
   }

   public xw a(xk $$0) {
      return this.h.equals($$0) ? this : new xw(this.d, this.e, this.f, this.g, $$0);
   }

   public xw a(boolean $$0) {
      return this.a($$0 ? this.h : xk.c);
   }

   public xw b() {
      xz $$0 = xz.a(this.c());
      yb $$1 = yb.a(this.g());
      return new xw($$1, null, $$0, this.g, this.h);
   }

   public static void a(ban.a $$0, yb $$1, xz $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(bao $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xg d() {
      return Objects.requireNonNullElseGet(this.g, () -> xg.b(this.c()));
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

   public static String a(xw $$0) {
      return "'"
         + $$0.f.a()
         + "' @ "
         + $$0.f.b()
         + "\n - From: "
         + $$0.d.c()
         + "/"
         + $$0.d.d()
         + ", message #"
         + $$0.d.b()
         + "\n - Salt: "
         + $$0.f.c()
         + "\n - Signature: "
         + xs.a($$0.e)
         + "\n - Last Seen: [\n"
         + $$0.f.d().b().stream().map($$0x -> "     " + xs.a($$0x) + "\n").collect(Collectors.joining())
         + " ]\n";
   }

   public yb k() {
      return this.d;
   }

   @Nullable
   public xs l() {
      return this.e;
   }

   public xz m() {
      return this.f;
   }

   @Nullable
   public xg n() {
      return this.g;
   }

   public xk o() {
      return this.h;
   }
}
