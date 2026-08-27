import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ReferenceCountUtil;

public class vj {
   public static <T extends va> vj.b a(vc<T> $$0) {
      return a(new uy<T>($$0));
   }

   private static vj.b a(ChannelInboundHandler $$0) {
      return $$1 -> {
         $$1.pipeline().replace($$1.name(), "decoder", $$0);
         $$1.channel().config().setAutoRead(true);
      };
   }

   public static <T extends va> vj.d b(vc<T> $$0) {
      return a(new uz<T>($$0));
   }

   private static vj.d a(ChannelOutboundHandler $$0) {
      return $$1 -> $$1.pipeline().replace($$1.name(), "encoder", $$0);
   }

   public static class a extends ChannelDuplexHandler {
      public void channelRead(ChannelHandlerContext $$0, Object $$1) {
         if (!($$1 instanceof ByteBuf) && !($$1 instanceof yb)) {
            $$0.fireChannelRead($$1);
         } else {
            ReferenceCountUtil.release($$1);
            throw new DecoderException("Pipeline has no inbound protocol configured, can't process packet " + $$1);
         }
      }

      public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
         if ($$1 instanceof vj.b $$3) {
            try {
               $$3.run($$0);
            } finally {
               ReferenceCountUtil.release($$1);
            }

            $$2.setSuccess();
         } else {
            $$0.write($$1, $$2);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void run(ChannelHandlerContext var1);

      default vj.b andThen(vj.b $$0) {
         return $$1 -> {
            this.run($$1);
            $$0.run($$1);
         };
      }
   }

   public static class c extends ChannelOutboundHandlerAdapter {
      public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
         if ($$1 instanceof yb) {
            ReferenceCountUtil.release($$1);
            throw new EncoderException("Pipeline has no outbound protocol configured, can't process packet " + $$1);
         } else {
            if ($$1 instanceof vj.d $$3) {
               try {
                  $$3.run($$0);
               } finally {
                  ReferenceCountUtil.release($$1);
               }

               $$2.setSuccess();
            } else {
               $$0.write($$1, $$2);
            }
         }
      }
   }

   @FunctionalInterface
   public interface d {
      void run(ChannelHandlerContext var1);

      default vj.d andThen(vj.d $$0) {
         return $$1 -> {
            this.run($$1);
            $$0.run($$1);
         };
      }
   }
}
